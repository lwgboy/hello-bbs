package kr.geun.o.routes.bbs.controller.api;

import kr.geun.o.core.exception.BaseException;
import kr.geun.o.core.response.ResData;
import kr.geun.o.core.utils.CmnUtils;
import kr.geun.o.routes.bbs.dto.BbsReplyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 댓글 API
 *
 * @author akageun
 */
@RestController
@RequestMapping("/api/bbs/v1")
public class BbsReplyApiController {

    @GetMapping("/reply")
    public ResponseEntity<ResData> getReply(
            @Valid BbsReplyDTO.Page param,
            BindingResult result
    ) {

        if (result.hasErrors()) {
            throw new BaseException(CmnUtils.getErrMsg(result, '\n'), HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(ResData.of("성공"));
    }

    @GetMapping("/reply/{replyId}")
    public ResponseEntity<ResData> getReply(
            @Valid BbsReplyDTO.Get param,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            throw new BaseException(CmnUtils.getErrMsg(result, '\n'), HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(ResData.of("성공"));
    }
}
