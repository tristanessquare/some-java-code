
List<Person> persons = getPersons();
    
if (checkAnyPersonExists(persons)) {
  executeStuff(persons);

  if (allFirstNamesValid(persons)) {
    if (!anyLastNameInvalid(persons)) {
      filteredPersons = filterPersonsWithCoolNames(persons);
      if (filteredPersons.isEmpty()) {
        // do things
      } else {
        // do other things
      }
    }
  }
}
