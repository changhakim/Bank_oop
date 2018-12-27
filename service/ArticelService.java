package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticelService {
	//CREATE
	public void article(String title,String content,String writer);
	//READ
	public ArrayList<ArticleBean> list();
	public ArrayList<ArticleBean> findByWriter();
	public ArticleBean findBySeq(String seq);
	public String redDate();
	public int countArticle();
	//UPDATE
	public void updateArticle(String seq,String content);
	//DELETE
	public void deleteArticle(String seq);
}
