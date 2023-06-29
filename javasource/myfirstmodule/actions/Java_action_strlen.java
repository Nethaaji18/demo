// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package myfirstmodule.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class Java_action_strlen extends CustomJavaAction<java.lang.Long>
{
	private java.lang.String strlen;

	public Java_action_strlen(IContext context, java.lang.String strlen)
	{
		super(context);
		this.strlen = strlen;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		String s1=strlen;  
		return (long) s1.length();
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "Java_action_strlen";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
