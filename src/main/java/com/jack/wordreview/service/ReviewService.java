package com.jack.wordreview.service;

import java.util.List;

import com.jack.wordreview.vo.Word;

/**
 * ReviewService
 */
public interface ReviewService {

  Word getWord();

  List<Word> list() throws Exception;

}
