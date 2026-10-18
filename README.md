# SecAgent AI Maven test repository

**For isolated security-remediation testing only. Do not deploy.**

This Maven/Java 17 single-module project deliberately declares old versions of:

- `org.apache.logging.log4j:log4j-core:2.14.1` (known security advisories)
- `org.apache.commons:commons-text:1.9` (CVE-2022-42889)

It contains one JUnit test checking a real library API (`StringEscapeUtils.escapeHtml4`).

## Local commands

```bash
mvn -B -ntp verify
mvn -B -ntp org.apache.maven.plugins:maven-dependency-plugin:3.10.0:tree -DoutputType=json -DoutputFile=dependency-tree.json
```

The SecAgent Java adapter calls OWASP Dependency-Check 13.0.0 itself. The
initial vulnerability database update can take a while. Configure
`SECAGENT_NVD_API_KEY` on the *SecAgent runner*, not in this repository.

Run `pnpm run scan` in the **security-agent** repository after registering this
repository with SecAgent. Only after successful detection should you run
`pnpm run remediate` / the GitHub Actions remediation workflow.
