package com.jack.wordreview.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.jack.wordreview.dao.WordDao;
import com.jack.wordreview.dao.impl.FileWordDao;
import com.jack.wordreview.entry.WordEntry;
import com.jack.wordreview.service.ReviewService;
import com.jack.wordreview.vo.Word;

/**
 * SimpleReviewServiceImpl
 */
public class SimpleReviewServiceImpl implements ReviewService {

  @Override
  public Word getWord() {
    Word word = new Word("chip", "Unknown");
    return word;
  }

  @Override
  public List<Word> list() throws Exception {

    List<Word> res = new ArrayList<>();
    WordDao wordDao = new FileWordDao();
    List<WordEntry> list = wordDao.list();
    for (WordEntry wordEntry : list) {
      Word word = new Word();
      BeanUtils.copyProperties(word, wordEntry);
      res.add(word);
    }
    return res;
  }

}
