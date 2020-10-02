package main.java.bean;

public class PathParam {
	private Integer id;
	private String name;

	public PathParam() {
		this.id = 0;
		this.name = "";
	}

	public PathParam(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String toString() {
    	if (id == 0 && name.isBlank()) {
    		return "Params is Empty";
    	}
    	return id + "'s name is " + name;
    }
}
