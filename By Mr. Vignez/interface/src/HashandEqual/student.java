package HashandEqual;

import java.util.Objects;

public class student {
	Integer id;
	String name;
	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 7 * hash + Objects.hashCode(this.id);
		hash = 7 * hash + Objects.hashCode(this.name);
		return hash;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass())
		{
			return false;
		}
		final student other = (student) obj;
		if(this.id != other.id)
		{
			return false;
		}
		if(!Objects.equals(this.id, this.name)){
			return false;
		}
		return true;
	}
	public student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
