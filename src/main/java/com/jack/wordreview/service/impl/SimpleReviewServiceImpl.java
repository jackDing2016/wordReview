package com.jack.wordreview.service.impl;

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

}
