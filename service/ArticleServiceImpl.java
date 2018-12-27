package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticelService {
	private HashMap<String,ArticleBean> map;
	private int seq;
	public ArticleServiceImpl() {
		map = new HashMap<>();
		seq = 1000;
	}
	@Override
	public void article(String title, String content, String writer) {
		ArticleBean article = new ArticleBean();
		article.setSeq(String.valueOf(seq));
		article.setTitle(title);
		article.setContent(content);
		article.setRedDate(redDate());
		article.setWriter(writer);
		map.put(article.getSeq(),article);
		seq++;
		
	}

	@Override
	public ArrayList<ArticleBean> list() {
		
		return (ArrayList<ArticleBean>) map.values();
	}

	@Override
	public ArrayList<ArticleBean> findByWriter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findBySeq(String seq) {
		
		return map.get(seq);
	}

	@Override
	public int countArticle() {
		// TODO Auto-generated method stub
		return map.size();
	}
	@Override
	public String redDate() {
		String redDate = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:a");
		redDate = sdf.format(date);
		return redDate;
	}
	@Override
	public void updateArticle(String seq,String content) {
		if(map.get(seq).getSeq().equals(seq)) {
			map.get(seq).setContent(content);
		}
		
	}

	@Override
	public void deleteArticle(String seq) {
		// TODO Auto-generated method stub
		
	}
	

}
