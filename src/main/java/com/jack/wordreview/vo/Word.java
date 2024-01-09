package com.jack.wordreview.vo;

/**
 * Word
 */
public class Word implements java.io.Serializable {

  private String name;
  private String definition;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public Word(String name, String definition) {
    this.name = name;
    this.definition = definition;
  }

  public Word() {

  }

  @Override
  public String toString() {
    return name + "=" + definition;
  }
}
