package com.xiaofan.oj.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建请求
 *
 */
@Data
public class QuestionAddRequest implements Serializable {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    /**
     * 题目答案
     */
    private String answer;

    /**
     * 判题用例
     */
    //输入输出用例用一个JSON对象表示，要转换为JSON对象，就需要先封装成一个类，一道题会有很多不同的输入输出用例，所以用list表示，要转换为JSON数组
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置
     */
    //包括时间限制、内存限制、栈限制，需要将其转换为JSON对象
    private JudgeConfig judgeConfig;

    private static final long serialVersionUID = 1L;
}