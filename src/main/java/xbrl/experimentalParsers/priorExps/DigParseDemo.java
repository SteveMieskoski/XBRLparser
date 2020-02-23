package xbrl.experimentalParsers.priorExps;

import org.apache.commons.digester3.Digester;
import org.xml.sax.SAXException;
import xbrl.experimentalParsers.elements.Arc;
import xbrl.experimentalParsers.elements.ExtendedLink;
import xbrl.experimentalParsers.elements.Linkbase;
import xbrl.experimentalParsers.elements.Loc;


import java.io.File;
import java.io.IOException;

public class DigParseDemo {

  public static void parse(String filename) {
    // Create a Digester instance
    Digester d = new Digester();
    d.setNamespaceAware(false);


    addRules(d);
    try {
      File file = new File(filename);
      d.parse(file);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    }

    Linkbase linkbase = (Linkbase) d.getRoot();
    linkbase.print();
  }

  private static void addRules(Digester d) {

    d.addObjectCreate("linkbase", Linkbase.class);
    d.addSetProperties("linkbase");

    d.addObjectCreate("linkbase/presentationLink", ExtendedLink.class);
      d.addSetProperties("linkbase/presentationLink");
    d.addSetNext("linkbase/presentationLink", "addExtendedLink");


    d.addObjectCreate("linkbase/presentationLink/presentationArc", Arc.class);
      d.addSetProperties("linkbase/presentationLink/presentationArc");
    d.addSetNext("linkbase/presentationLink/presentationArc", "addArc");


    d.addObjectCreate("linkbase/presentationLink/loc", Loc.class);
      d.addSetProperties("linkbase/presentationLink/loc");
    d.addSetNext("linkbase/presentationLink/loc", "addLoc");

    // --------------------------------------------------
    // when we encounter a "person" tag, do the following:

    // create a new instance of class Person, and push that
    // object onto the digester stack of objects

    //        d.addObjectCreate( "linkbase/presentationLink", ExtendedLink.class );
    //
    //        // map *any* attributes on the tag to appropriate
    //        // setter-methods on the top object on the stack (the Person
    //        // instance created by the preceeding rule).
    //        //
    //        // For example:
    //        // if attribute "id" exists on the xml tag, and method setId
    //        // with one parameter exists on the object that is on top of
    //        // the digester object stack, then a call will be made to that
    //        // method. The value will be type-converted from string to
    //        // whatever type the target method declares (where possible),
    //        // using the commons ConvertUtils functionality.
    //        //
    //        // Attributes on the xml tag for which no setter methods exist
    //        // on the top object on the stack are just ignored.
    //        d.addSetProperties( "linkbase/presentationLink" );
    //
    //        // call the addPerson method on the second-to-top object on
    //        // the stack (the AddressBook object), passing the top object
    //        // on the stack (the recently created Person object).
    //        d.addObjectCreate( "linkbase/presentationLink/presentationArc", Arc.class );
    //        d.addSetNext( "linkbase/presentationLink/presentationArc", "addArc" );
    //        d.addSetProperties( "linkbase/presentationLink/presentationArc" );
    //
    //        d.addObjectCreate( "linkbase/presentationLink/loc", Loc.class );
    //        d.addSetNext( "linkbase/presentationLink/loc", "addLoc" );
    //        d.addSetProperties( "linkbase/presentationLink/loc" );
    // --------------------------------------------------
    // when we encounter a "name" tag, call setName on the top
    // object on the stack, passing the text contained within the
    // body of that name element [specifying a zero parameter count
    // implies one actual parameter, being the body text].
    //        // The top object on the stack will be a person object, because
    //        // the pattern address-book/person always triggers the
    //        // ObjectCreateRule we added previously.
    //        d.addCallMethod( "address-book/person/name", "setName", 0 );
    //
    //        // --------------------------------------------------
    //        // when we encounter an "email" tag, call addEmail on the top
    //        // object on the stack, passing two parameters: the "type"
    //        // attribute, and the text within the tag body.
    //        d.addCallMethod( "address-book/person/email", "addEmail", 2 );
    //        d.addCallParam( "address-book/person/email", 0, "type" );
    //        d.addCallParam( "address-book/person/email", 1 );
    //
    //        // --------------------------------------------------
    //        // When we encounter an "address" tag, create an instance of class
    //        // Address and push it on the digester stack of objects. After
    //        // doing that, call addAddress on the second-to-top object on the
    //        // digester stack (a "Person" object), passing the top object on
    //        // the digester stack (the "Address" object). And also set things
    //        // up so that for each child xml element encountered between the start
    //        // of the address tag and the end of the address tag, the text
    //        // contained in that element is passed to a setXXX method on the
    //        // Address object where XXX is the name of the xml element found.
    //
    ////        d.addObjectCreate( "address-book/person/address", Address.class );
    //        d.addSetNext( "address-book/person/address", "addAddress" );
    //        d.addSetNestedProperties( "address-book/person/address" );
  }
}
