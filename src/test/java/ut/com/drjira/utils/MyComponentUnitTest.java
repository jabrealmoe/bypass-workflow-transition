package ut.com.drjira.utils;

import org.junit.Test;
import com.drjira.utils.api.MyPluginComponent;
import com.drjira.utils.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}