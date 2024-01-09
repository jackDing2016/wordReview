package com.jack.wordreview.dao;

import java.util.List;

import com.jack.wordreview.entry.WordEntry;

/**
 * WordDao
 */
public interface WordDao {

  List<WordEntry> list() throws Exception;

}
