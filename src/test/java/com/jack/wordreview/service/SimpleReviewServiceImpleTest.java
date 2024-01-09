package com.jack.wordreview.service;

import java.util.List;

import org.junit.Test;

import com.jack.wordreview.service.impl.SimpleReviewServiceImpl;
import com.jack.wordreview.vo.Word;

/**
 * SimpleReviewServiceImpleTest
 */
public class SimpleReviewServiceImpleTest {

  @Test
  public void list() throws Exception {
    ReviewService reviewService = new SimpleReviewServiceImpl();
    List<Word> list = reviewService.list();
    for (Word word : list) {
      System.out.println(word);
    }
  }

}
