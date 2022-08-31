package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
	public static Performable thTodoListPage() {
		return Task.where("Rama opens the Todo list page",
		Open.browserOn().the(TodoListPage.class));
		
	}
	
}