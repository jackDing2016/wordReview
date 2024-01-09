package com.jack.wordreview.dao.impl;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
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
    List<String> lines = FileUtils.readLines(file, "UTF-8");

    List<WordEntry> res = new ArrayList<>();
    for (String line : lines) {
      String[] strArr = line.split("=");
      WordEntry wordEntry = new WordEntry(strArr[0], strArr[1]);
      res.add(wordEntry);
    }
    return res;
  }
}
