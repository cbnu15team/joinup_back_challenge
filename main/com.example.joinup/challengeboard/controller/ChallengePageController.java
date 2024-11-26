package com.example.joinup.challengeboard.controller;

import com.example.joinup.challengeboard.dto.ChallengePageDTO;
import com.example.joinup.challengeboard.service.ChallengePageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/challenge-pages")
public class ChallengePageController {

    private final ChallengePageService challengePageService;

    // 생성자에서 ChallengePageService를 주입받습니다.
    public ChallengePageController(ChallengePageService challengePageService) {
        this.challengePageService = challengePageService;
    }

    // 게시글 목록 조회
    @GetMapping
    public ResponseEntity<List<ChallengePageDTO>> getAllChallengePages() {
        List<ChallengePageDTO> pages = challengePageService.getAllChallengePages();
        return ResponseEntity.ok(pages);
    }
}
