package az.kapitalbank.birbankinvest.component_manager

class ComponentNotFoundException(key: String) : Throwable("Component of the $key type was not found")