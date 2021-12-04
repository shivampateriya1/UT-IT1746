package com.knoldus.validator
import com.knoldus.models.Employee
import com.knoldus.db.CompanyData
import com.questions.emailValidator.EmailValidator

class EmployeeValidator (companyName: CompanyData, validateEmail: EmailValidator) {

  def employeeIsValid(employee: Employee): Boolean = {

    if(companyName.getCompanyByName(employee.companyName).isDefined && validateEmail.emailIsValid(employee.emailId))
      true
    else
      false
  }
}
