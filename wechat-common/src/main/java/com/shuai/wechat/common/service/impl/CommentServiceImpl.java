package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Comment;
import com.shuai.wechat.common.mapper.CommentMapper;
import com.shuai.wechat.common.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zheng
 */
@Slf4j
@Service
@Transactional
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {
  @Resource
  private CommentMapper  mapper;
}
