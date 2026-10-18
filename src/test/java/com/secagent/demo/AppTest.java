package com.secagent.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void escapesHtmlSpecialCharacters() {
        assertEquals("Hello &lt;Java&gt; &amp; SecAgent", App.escapeHtml("Hello <Java> & SecAgent"));
    }
}
