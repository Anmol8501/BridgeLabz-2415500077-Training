package ai_driven_resume_screening_system;

abstract class JobRole { String title; JobRole(String t){title=t;} public String toString(){return title;} }
class SoftwareEngineer extends JobRole { SoftwareEngineer(){super("Software Engineer");} }
class DataScientist extends JobRole { DataScientist(){super("Data Scientist");} }
class ProductManager extends JobRole { ProductManager(){super("Product Manager");} }
