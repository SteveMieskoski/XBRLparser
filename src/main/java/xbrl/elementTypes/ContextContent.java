package xbrl.elementTypes;

import java.util.LinkedList;
import java.util.List;

public class ContextContent {

  protected String currentPeriodEndDate;
  protected LinkedList<OrganizationElement> organizationContent;
  protected LinkedList<ContextElement> contextElements;
  protected LinkedList<String> contexts;
  protected List<FactElement> allFacts;

  protected LinkedList<ContextElement> baseContextElements;
  protected LinkedList<String> baseContacts;

  protected LinkedList<ContextElement> isolatedContextElements;

  public LinkedList<ContextElement> getContextElements() {
    return contextElements;
  }

  public void setContextElements(LinkedList<ContextElement> contextElements) {
    this.contextElements = contextElements;
  }

  public void addAllContextElements(LinkedList<ContextElement> contextElements) {
    if (this.contextElements == null) {
      for (ContextElement ce : contextElements) {
        addContext(ce);
      }
    } else {
      for (ContextElement ce : contextElements) {
        if (!hasContextElement(ce)) {
          addContext(ce);
        }
      }
    }
  }

  public LinkedList<String> getContexts() {
    return contexts;
  }

  public void setContexts(LinkedList<String> contexts) {
    this.contexts = contexts;
  }

  public void addContext(ContextElement contextElement) {
    if (this.contextElements == null) {
      this.contextElements = new LinkedList<>();
    }
    if (this.contexts == null) {
      this.contexts = new LinkedList<>();
    }
    if (contextElement != null) {
      if (contextElement.getId() != null) {
        this.contextElements.add(contextElement);
        this.contexts.add(contextElement.getId());
      }
    }
  }

  public void addBaseContext(ContextElement contextElement) {
    if (this.baseContextElements == null) {
      this.baseContextElements = new LinkedList<>();
    }
    if (this.baseContacts == null) {
      this.baseContacts = new LinkedList<>();
    }
    if (contextElement != null) {
      if (contextElement.getId() != null) {
        this.baseContextElements.add(contextElement);
        this.baseContacts.add(contextElement.getId());
      }
    }
  }

  public boolean hasContextElement(ContextElement contextElement) {
    if (this.contextElements != null && this.contexts != null) {
      if (contextElement.getId() != null) {
        int idx = this.contexts.indexOf(contextElement.getId());
        return idx >= 0;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public boolean hasContext(String context) {
    if (this.contextElements != null && this.contexts != null) {
      int idx = this.contexts.indexOf(context);

      return idx >= 0;
    } else {
      return false;
    }
  }

  public boolean hasBaseContext(String context) {
    if (this.baseContextElements != null && this.baseContacts != null) {
      int idx = this.baseContacts.indexOf(context);

      return idx >= 0;
    } else {
      return false;
    }
  }

  public void addContextFact(FactElement factElement) {
    if (factElement != null) {
      String contextRef = factElement.getContextRef();
      if (contextRef != null) {
        if (hasContext(contextRef) || hasBaseContext(contextRef)) {
          int idx = this.contexts.indexOf(contextRef);
          if (idx >= 0) {
            ContextElement contextElement = this.contextElements.get(idx);
            contextElement.addFact(factElement);
          } else {
            int idxb = this.baseContacts.indexOf(contextRef);
            ContextElement contextElement = this.baseContextElements.get(idxb);
            contextElement.addFact(factElement);
          }
        }
      }
    }
  }

  public void addAFact(FactElement factElement) {
    if (this.allFacts == null) {
      this.allFacts = new LinkedList<>();
    }
    this.allFacts.add(factElement);
  }

  public ContextElement getContext(String context) {
    if (this.contextElements != null && this.contexts != null) {
      int idx = this.contexts.indexOf(context);
      if (idx >= 0) {
        return this.contextElements.get(idx);
      } else {
        return null;
      }
    } else {
      return null;
    }
  }

  public void addIsolatedContextElement(ContextElement contextElement) {
    if (this.isolatedContextElements == null) {
      this.isolatedContextElements = new LinkedList<>();
    }
    this.isolatedContextElements.add(contextElement);
  }

  public void addOrganizationElement(OrganizationElement organizationElement) {
    if (this.organizationContent == null) {
      this.organizationContent = new LinkedList<>();
    }
    if (organizationElement.getTag().equals("DocumentPeriodEndDate")) {
      setCurrentPeriodEndDate(organizationElement.getValue());
    }
    this.organizationContent.add(organizationElement);
  }

  public void addAllOrganizationElements(LinkedList<OrganizationElement> organizationElements) {
    if (this.organizationContent == null) {
      for (OrganizationElement oe : organizationElements) {
        String contextRef = oe.getContextRef();
        if (contextRef != null) {
          ContextElement contextElement = getContext(contextRef);
          contextElement.addOrganizationElement(oe);
        }
        addOrganizationElement(oe);
      }
    } else {
      for (OrganizationElement oe : organizationElements) {
        if (!this.organizationContent.contains(oe)) {
          String contextRef = oe.getContextRef();
          if (contextRef != null) {
            ContextElement contextElement = getContext(contextRef);
            contextElement.addOrganizationElement(oe);
          }
          addOrganizationElement(oe);
        }
      }
    }
  }

  public LinkedList<OrganizationElement> getOrganizationElements() {
    return organizationContent;
  }

  public void setOrganizationElements(LinkedList<OrganizationElement> organizationElements) {
    this.organizationContent = organizationElements;
  }

  public String getCurrentPeriodEndDate() {
    return currentPeriodEndDate;
  }

  public void setCurrentPeriodEndDate(String currentPeriodEndDate) {
    this.currentPeriodEndDate = currentPeriodEndDate;
  }

  public LinkedList<ContextElement> getBaseContextElements() {
    return baseContextElements;
  }

  public void setBaseContextElements(LinkedList<ContextElement> baseContextElements) {
    this.baseContextElements = baseContextElements;
  }

  public List<FactElement> getAllFacts() {
    return allFacts;
  }

  public void setAllFacts(List<FactElement> allFacts) {
    this.allFacts = allFacts;
  }
}
