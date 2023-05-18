package com.ssafy.boardcomment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.boardcomment.model.BoardComment;
import com.ssafy.boardcomment.model.service.BoardCommentService;
import com.ssafy.user.model.User;

@RestController
@RequestMapping("/comment")
public class BoardCommentController {
	private BoardCommentService boardCommentService;

	public BoardCommentController(BoardCommentService boardCommentService) {
		super();
		this.boardCommentService = boardCommentService;
	}
	
	@GetMapping("/board/{articleNo}")
	public ResponseEntity<?> getCommentList(@PathVariable("articleNo") String articleNo) {
		try {
			List<BoardComment> listComment = boardCommentService.getCommentList(articleNo);
			return new ResponseEntity<List<BoardComment>>(listComment, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/board")
	public ResponseEntity<?> postComment(@RequestBody BoardComment boardComment) {
		try {
			System.out.println(boardComment);
			int cnt = boardCommentService.postComment(boardComment);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); 
		}
	}
	
	@PutMapping("/board/{commentNo}")
	public ResponseEntity<?> putComment(@RequestBody BoardComment boardComment, @PathVariable String commentNo) throws Exception {
		try {
			System.out.println(boardComment);
			int cnt = boardCommentService.putComment(boardComment);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/board/{commentNo}")
	public ResponseEntity<?> delComment(@PathVariable("commentNo") String commentNo) {
		try {
			int cnt = boardCommentService.delComment(commentNo);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
