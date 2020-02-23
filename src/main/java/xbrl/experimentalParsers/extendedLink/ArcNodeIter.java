package xbrl.experimentalParsers.extendedLink;

import org.dom4j.Element;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * WARNING: this implementation and related classes are very experimental and primarily a trial
 * demonstration
 */
// convert this to an inner class possibly??
// may not be possible with my node structure
public class ArcNodeIter {

  private ArcNode root;
  private LinkedList<String> stack;
  private LinkedList<UUID> marked;
  private LinkedList<Element> elements;

  public ArcNodeIter(ArcNode root) {
    this.root = root;
    this.stack = new LinkedList<>();
    this.marked = new LinkedList<>();
    this.elements = new LinkedList<>();
    buildStack();
  }

  private void buildStack() {
    //        stack.add(this.root.name + " " + this.root.order);
    if (this.root.children != null) {
      processChildren(this.root.children, true);
    }
  }

  private void processChildren(List<ArcNode> nodes, Boolean start) {
    for (ArcNode n : nodes) {
      if (start && n.children != null) {
        if (n.parent.name.equals(this.root.name)) {
//          System.out.println(this.root.getId());
          this.marked.add(this.root.getId());
          this.stack.add(this.root.name + "@@" + this.root.order);
          if(this.root.element != null) this.elements.add(this.root.element);
        }
      }
      if (!this.stack.contains(n.name + "@@" + n.order)) {
        this.marked.add(n.getId());
        this.stack.add(n.name + "@@" + n.order);
        if(n.element != null) this.elements.add(n.element);
      }
      if (n.children != null) {
        processChildren(n.children, false);
      }
    }
  }

  public LinkedList<Element> getElements() {
    return elements;
  }

  public void setElements(LinkedList<Element> elements) {
    this.elements = elements;
  }

  public ArcNode getRoot() {
    return root;
  }

  public void setRoot(ArcNode root) {
    this.root = root;
  }

  public LinkedList<String> getStack() {
    return stack;
  }

  public void setStack(LinkedList<String> stack) {
    this.stack = stack;
  }

  public LinkedList<UUID> getMarked() {
    return marked;
  }

  public void setMarked(LinkedList<UUID> marked) {
    this.marked = marked;
  }
}
