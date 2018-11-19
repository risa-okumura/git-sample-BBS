package jp.co.rakus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.rakus.domain.JoinedComment;
import jp.co.rakus.repository.JoindCommentRepository;

@Service
public class JoinedCommentService {

	@Autowired
	private JoindCommentRepository commentRepository;

	/**
	 * コメントを登録します.
	 * 
	 * @param comment
	 *            コメント情報
	 * @return 登録したコメント情報
	 */
	public void save(JoinedComment comment) {
		commentRepository.insert(comment);
	}
}
