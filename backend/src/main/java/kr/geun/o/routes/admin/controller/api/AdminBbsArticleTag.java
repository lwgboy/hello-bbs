package kr.geun.o.routes.admin.controller.api;

import kr.geun.o.core.exception.BaseException;
import kr.geun.o.core.utils.CmnUtils;
import kr.geun.o.routes.admin.dto.AdminBbsArticleTagDTO;
import kr.geun.o.core.response.ResData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 게시글 관리 API
 *  - 태그 관리
 *
 * @author akageun
 */
@Slf4j
@RestController
@RequestMapping("/api/admin/bbs/article")
public class AdminBbsArticleTag {

	/**
	 * 태그 목록
	 * TODO : 구현해야함.
	 *
	 * @param param
	 * @param result
	 * @return
	 */
	@GetMapping("/tag")
	public ResponseEntity<ResData> tagPage(@Valid AdminBbsArticleTagDTO.Page param, BindingResult result) {
		if (result.hasErrors()) {
			throw new BaseException(CmnUtils.getErrMsg(result, '\n'), HttpStatus.BAD_REQUEST);
		}

		return ResponseEntity.ok(ResData.of("성공"));
	}
}
