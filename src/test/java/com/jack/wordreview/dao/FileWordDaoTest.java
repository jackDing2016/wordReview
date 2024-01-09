package com.jack.wordreview.dao;

import java.util.List;

import org.junit.Test;

import com.jack.wordreview.dao.impl.FileWordDao;
import com.jack.wordreview.entry.WordEntry;

/**
 * FileWordDaoTest
 */
public class FileWordDaoTest {

  @Test
  public void list() throws Exception {
    WordDao wordDao = new FileWordDao();
    List<WordEntry> list = wordDao.list();
    for (WordEntry wordEntry : list) {
      System.out.println(wordEntry);
    }

    assert (true);
  }

  @Test
  public void singleTest() {
    System.out.println("just test for maven run one test");
    assert (true);
  }

}
