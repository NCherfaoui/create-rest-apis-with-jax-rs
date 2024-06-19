//package net.restfulapi.app.rest.domain;
//
//import jakarta.xml.bind.annotation.adapters.XmlAdapter;
//
//import jakarta.ws.rs.core.Link;
//
//public class LinkAdapter extends XmlAdapter<String, Link> {
//    @Override
//    public Link unmarshal(String v) {
//        return Link.fromUri(v).build();
//    }
//
//    @Override
//    public String marshal(Link v) {
//        return v.getUri().toString();
//    }
//}
