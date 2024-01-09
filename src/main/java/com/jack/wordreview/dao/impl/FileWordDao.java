package com.jack.wordreview.dao.impl;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.jack.wordreview.dao.WordDao;
import com.jack.wordreview.entry.WordEntry;

/**
 * FileWordDao
 */
public class FileWordDao implements WordDao {
  @Override
  public List<WordEntry> list() throws Exception {
    File file = new File("/home/jack/temp/word_review.txt");
    List lines = FileUtils.readLines(file);
    for (Object object : lines) {
      System.out.println(object);
    }
    return null;
  }
}
