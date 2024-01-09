package com.jack.wordreview.entry;

/**
 * WordEntry
 */
public class WordEntry {

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

  public WordEntry(String name, String definition) {
    this.name = name;
    this.definition = definition;
  }

  @Override
  public String toString() {
    return name + "=" + definition;
  }
}
