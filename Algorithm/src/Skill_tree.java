import java.util.Arrays;

public class Skill_tree {

	public int solution(String skill, String[] skill_trees) {
		int answer = skill_trees.length;
		int before = 0, after = 0;
		for (int i = 0; i < skill_trees.length; i++) {
			before = skill_trees[i].indexOf(skill.charAt(0));
			for (int j = 1; j < skill.length(); j++) {
				after = skill_trees[i].indexOf(skill.charAt(j));
				if ((before > after && after != -1) || (before == -1 && after != -1)) {
					answer--;
					break;
				}
				before = after;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Skill_tree st = new Skill_tree();
		st.solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA", "AQWER" });
	}

}
