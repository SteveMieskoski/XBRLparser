package xbrl.experimentalParsers.extendedLink;

import org.dom4j.Element;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * WARNING: this implementation and related classes are very experimental and primarily a trial
 * demonstration
 */
public class ArcNode {
  ArcNode parent;
  List<ArcNode> children;

  Element element;
  String name;
  String order;
  UUID id;

  public ArcNode(ArcNode parent, String name, String order, UUID id) {
    this.parent = parent;
    this.name = name;
    this.order = order;
    this.id = id;
  }

  public ArcNode(ArcNode parent, String name, String order, UUID id, Element element) {
    this.parent = parent;
    this.name = name;
    this.order = order;
    this.id = id;
    this.element = element;
  }

  public void addChildren(ArcNode value) {
    if (this.children == null) {
      this.children = new LinkedList<>();
    }
    this.children.add(value);
  }

  public Boolean contains(String name) {
    if (name.equals(this.name)) {
      return true;
    } else {
      System.out.println(name);
      if (this.children != null) {
        for (ArcNode n : this.children) {
          Boolean found = n.contains(name);
          if (found) {
            return true;
          }
        }
      }
      return false;
    }
  }

  public ArcNode find(String name) {
    if (name.equals(this.name)) {
      return this;
    } else {

      if (this.children != null) {
        for (ArcNode n : this.children) {
          ArcNode found = n.find(name);
          if (found != null) {
            return found;
          }
        }
      }
      return null;
    }
  }

  public Boolean findAndAdd(String parentName, String name, String order, UUID uuid) {
    if (parentName.equals(this.name)) {
      return true;
    } else {
      System.out.println(parentName);
      if (this.children != null) {
        for (ArcNode n : this.children) {
          Boolean found = n.findAndAdd(parentName, name, order, uuid);
          if (found) {
            return true;
          }
        }
      }
      return false;
    }
  }

  public ArcNode findParent(String parentName, String parentOrder) {
    if (parentName.equals(this.name) && parentOrder.equals(this.order)) {
      return this;
    } else {
      if (this.children != null) {
        for (ArcNode n : this.children) {
          ArcNode found = n.findParent(parentName, parentOrder);
          if (found != null) {
            return found;
          }
        }

      } else {
        System.out.println("children null");
      }
      return null;
    }
  }

  public ArcNode findParentAddChild(
      String parentName,
      String parentOrder,
      String name,
      String order,
      UUID uuid,
      Element element) {
    //      System.out.println("Parent order: " + parentOrder);
    //      System.out.println("Parent name: " + parentName);
    if (parentName.equals(this.name) && this.parent == null) {

      //      System.out.println("ArcNode found: " + name);
      addChildren(new ArcNode(this, name, order, uuid, element));
      return this;

    } else if (parentName.equals(this.name) && parentOrder.equals(this.order)) {
      //      System.out.println("ArcNode found: " + name);
      addChildren(new ArcNode(this, name, order, uuid, element));
      return this;

    } else if (this.children != null) {
      for (int i = 0; i < this.children.size(); i++) {
        ArcNode found =
            this.children
                .get(i)
                .findParentAddChild(parentName, parentOrder, name, order, uuid, element);
        //            System.out.println("findParent found: " + found);
        if (found != null) {
          return found;
        }
      }
      return null;
    } else {
      System.out.println("children null");
      return addChild(name, order, uuid, element);
      //        if(this.parent != null){
      //
      //        } else {
      //            return null;
      //        }
    }
    //      return null;
  }

  public ArcNode addChild(String name, String order, UUID uuid) {
    addChildren(new ArcNode(this, name, order, uuid));
    return this;
  }

  public ArcNode addChild(String name, String order, UUID uuid, Element element) {
    addChildren(new ArcNode(this, name, order, uuid, element));
    return this;
  }

  public void printChildren() {
    if (this.children != null) {
      if (this.parent == null) {
        System.out.println("Top Level: parent: null");
      } else {
        System.out.println("parent: " + this.parent.name);
      }
      System.out.println(toString());
      for (ArcNode an : this.children) {
        an.printChildren();
      }
    } else {
      if (this.parent == null) {
        System.out.println("Top Level: parent: null");
        System.out.println(toString());
      } else {
        System.out.println("parent: " + this.parent.name);
        System.out.println(toString());
      }

      System.out.println("Branch_End___");
    }
  }

  public ArcNode getParent() {
    return parent;
  }

  public void setParent(ArcNode parent) {
    this.parent = parent;
  }

  public List<ArcNode> getChildren() {
    return children;
  }

  public void setChildren(List<ArcNode> children) {
    this.children = children;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  public String toString() {
    String display =
        " name='"
            + name
            + '\''
            + ", order='"
            + order
            + '\''
            + ", id="
            + id
            + ", children="
            + children
            + '}';
    if (parent != null) {
      display = "parent=" + parent.name + display;
    }
    return "ArcNode{" + display;
  }
}
