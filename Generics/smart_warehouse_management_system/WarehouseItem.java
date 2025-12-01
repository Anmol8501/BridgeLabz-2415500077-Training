package smart_warehouse_management_system;

abstract class WarehouseItem { String name; WarehouseItem(String n){name=n;} public String toString(){return name;} }
class Electronics extends WarehouseItem { Electronics(String n){super(n);} }
class Groceries extends WarehouseItem { Groceries(String n){super(n);} }
class Furniture extends WarehouseItem { Furniture(String n){super(n);} }

