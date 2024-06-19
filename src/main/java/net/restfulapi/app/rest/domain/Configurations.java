package net.restfulapi.app.rest.domain;

import java.util.List;
import jakarta.ws.rs.core.Link;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "configurations")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configurations
{
 @XmlAttribute
 private Integer size;

 @XmlJavaTypeAdapter(LinkAdapter.class)
 @XmlElement
 private Link link;

 @XmlElement(name="configuration")
 private List<Configuration> configurations;

 public Integer getSize() {
  return size;
 }

 public void setSize(Integer size) {
  this.size = size;
 }

 public Link getLink() {
  return link;
 }

 public void setLink(Link link) {
  this.link = link;
 }

 public List<Configuration> getConfigurations() {
  return configurations;
 }

 public void setConfigurations(List<Configuration> configurations) {
  this.configurations = configurations;
 }

 public static class LinkAdapter extends XmlAdapter<String, Link> {
    @Override
    public Link unmarshal(String v) {
        return Link.fromUri(v).build();
    }

    @Override
    public String marshal(Link v) {
        return v.getUri().toString();
    }
 }
}