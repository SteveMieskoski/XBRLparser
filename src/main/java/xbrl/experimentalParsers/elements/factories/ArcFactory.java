package xbrl.experimentalParsers.elements.factories;

import org.apache.commons.digester3.AbstractObjectCreationFactory;
import org.apache.commons.digester3.FactoryCreateRule;
import org.xml.sax.Attributes;
import xbrl.experimentalParsers.elements.ExtendedLink;

public class ArcFactory extends AbstractObjectCreationFactory<ExtendedLink> {
    /**
     * Factory method called by {@link FactoryCreateRule} to supply an object based on the element's attributes.
     *
     * @param attributes the element's attributes
     * @return creates a new T instance
     * @throws Exception any exception thrown will be propagated upwards
     */
    @Override
    public ExtendedLink createObject(Attributes attributes) throws Exception {
        String role = attributes.getValue("role");

        if ( role == null )
        {
            throw new Exception( "Required role attribute not present on the extendedLink." );
        }

        return new ExtendedLink(role);
    }
}
