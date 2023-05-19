package com.ssafy.comment.controller;

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

import com.ssafy.comment.model.Comment;
import com.ssafy.comment.model.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	private CommentService commentService;

	public CommentController(CommentService commentService) {
		super();
		this.commentService = commentService;
	}
	
	@GetMapping("/board/{articleNo}")
	public ResponseEntity<?> getCommentList(@PathVariable("articleNo") String articleNo) {
		try {
			List<Comment> listComment = commentService.getCommentList(articleNo);
			return new ResponseEntity<List<Comment>>(listComment, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/board")
	public ResponseEntity<?> postComment(@RequestBody Comment boardComment) {
		try {
			System.out.println(boardComment);
			int cnt = commentService.postComment(boardComment);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); 
		}
	}
	
	@PutMapping("/board/{commentNo}")
	public ResponseEntity<?> putComment(@RequestBody Comment boardComment, @PathVariable String commentNo) throws Exception {
		try {
			System.out.println(boardComment);
			int cnt = commentService.putComment(boardComment);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/board/{commentNo}")
	public ResponseEntity<?> delComment(@PathVariable("commentNo") String commentNo) {
		try {
			int cnt = commentService.delComment(commentNo);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/hotplace/{articleNo}")
	public ResponseEntity<?> getCommentListHot(@PathVariable("articleNo") String articleNo) {
		try {
			List<Comment> listComment = commentService.getCommentListHot(articleNo);
			return new ResponseEntity<List<Comment>>(listComment, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/hotplace")
	public ResponseEntity<?> postCommentHot(@RequestBody Comment hotplaceComment) {
		try {
			System.out.println(hotplaceComment);
			int cnt = commentService.postCommentHot(hotplaceComment);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); 
		}
	}
	
	@PutMapping("/hotplace/{commentNo}")
	public ResponseEntity<?> putCommentHot(@RequestBody Comment hotplaceComment, @PathVariable String commentNo) throws Exception {
		try {
			System.out.println(hotplaceComment);
			int cnt = commentService.putCommentHot(hotplaceComment);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/hotplace/{commentNo}")
	public ResponseEntity<?> delCommentHot(@PathVariable("commentNo") String commentNo) {
		try {
			int cnt = commentService.delCommentHot(commentNo);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200;
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
