package app.core.demo.queue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author emorales
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TestMessage {
    @XmlElement(name = "text")
    public String text;
}
