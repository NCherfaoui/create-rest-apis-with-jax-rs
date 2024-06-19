package net.restfulapi.app.rest.domain;

import jakarta.ws.rs.core.Link;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.restfulapi.app.rest.domain.common.Status;

@XmlRootElement(name="configuration")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration
{
 @XmlAttribute
 private Integer id;

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

 @XmlJavaTypeAdapter(LinkAdapter.class)
 @XmlElement
 private Link link;
 @XmlElement
 private String content;
 @XmlElement
 private Status status;

 public Link getLink() {
  return link;
 }

 public void setLink(Link link) {
  this.link = link;
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getContent() {
  return content;
 }

 public void setContent(String content) {
  this.content = content;
 }

 public Status getStatus() {
  return status;
 }

 public void setStatus(Status status) {
  this.status = status;
 }
}