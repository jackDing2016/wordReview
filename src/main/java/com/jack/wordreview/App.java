package com.jack.wordreview;

import com.jack.wordreview.dao.WordDao;
import com.jack.wordreview.dao.impl.FileWordDao;
import com.jack.wordreview.service.ReviewService;
import com.jack.wordreview.service.impl.SimpleReviewServiceImpl;
import com.jack.wordreview.vo.Word;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello World!");
    ReviewService reviewService = new SimpleReviewServiceImpl();
    Word word = reviewService.getWord();
    System.out.println("word: " + word.getName() + " definition: " + word.getDefinition());

    WordDao wordDao = new FileWordDao();
    wordDao.list();
  }
}
