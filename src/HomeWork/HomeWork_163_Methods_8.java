package HomeWork;

public class HomeWork_163_Methods_8 {
	
	
	public boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
		if(!notEmpty) {
			return false;
		}else {
			if(taskId-currentId==1) {
				return true;
			}else {
				return false;
			}	
		}
	  }
	}
