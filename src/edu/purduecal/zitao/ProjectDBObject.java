package edu.purduecal.zitao;
import com.mongodb.BasicDBObject;


public class ProjectDBObject extends BasicDBObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String subtitle;
	private String problem;
	private String project;
	private String outcome;
	private String flyerFile;
	private String flyerPicture;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	public String getFlyerFile() {
		return flyerFile;
	}
	public void setFlyerFile(String flyerFile) {
		this.flyerFile = flyerFile;
	}
	public String getFlyerPicture() {
		return flyerPicture;
	}
	public void setFlyerPicture(String flyerPicture) {
		this.flyerPicture = flyerPicture;
	}
	
//	private ArrayList<E> Pictures;
}
