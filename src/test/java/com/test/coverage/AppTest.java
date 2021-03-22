package com.test.coverage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AppTest
{
    @Test
    public void emptyMessage() {
        App app = new App();
        assertThat(app.execute(new Bean("", null)), is(false));
    }

    @Test
    public void nullMessage() {
        App app = new App();
        assertThat(app.execute(new Bean(null, null)), is(false));
    }

    @Test
    public void validMessage() {
        App app = new App();
        assertThat(app.execute(new Bean("test", null)), is(true));
    }
}
