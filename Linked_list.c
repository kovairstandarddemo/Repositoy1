struct char_list
{
  char *str;
  struct char_list *next;
};

struct char_list cl3 = {"Third",(struct char_list*)(0)};// BR ID 41 
struct char_list cl2 = {"Second",&cl3};
struct char_list cl1 = {"First",&cl2};

struct big_list
{
  char *name;
  struct char_list *strings;
  struct big_list *next;
};

struct big_list bl2 = {"Big List 2",&cl1,(struct big_list*)(0)};
struct big_list bl1 = {"Big List 1",&cl3,&bl2};

void show_head_of_big_list (struct big_list *big)
{
  if (big != (struct big_list*)(0))
  {
    big->name = "This is the head of the big list";
  }
  big = (struct big_list*)(0);
}


/*
 * The above code fragment shows a procedure that modifies a linked list.
 * If it is required to view every single element of the linked list,
 * this can best be achieved using the typedef expansion technique
 * which recurses up and down structures and similar types to completely
 * expand all paths until all the possible routes end in null.
 * The values for all he elements of the linked list will then be
 * reported upon.
 */

/*
 * Creating a test case for the procedure causes 2 variables to be
 * populated in the IO view.
 * These are an input and output variables for the parameter big.
 * The input parameter should be assigned the address of global bl1.
 * We know that bl1 is a linked list. We wish to determine all the
 * values stored in the linked list. This can be achieved by selecting
 * the output variable in the IO view and selecting the Set as Typedef
 * Expansion option. Ensure the variable is not suspended. The value
 * field for the variable is a marker or comment indicating the operation.
 *
 * Running and accepting the test case adds an additional 9 variables
 * into the IO. These are the variables that have been found in the
 * linked list. Note only the pointer variables that equate to null are
 * shown. This is because non-null pointer addresses may change between
 * execution of test programs resulting inregression failure. Their
 * actual values are insignificant, but the members of this pointer
 * are displayed in full. Viewing the added variables in the IO view
 * it can be seen that not only is the structure pointed to by the
 * parameter expanded but also the pointer to structures found as
 * elements will also be expanded.
 * Care should be exercised using this facility. All pointer values
 * should be assigned to valid section of memory or set to null -
 * otherwise the results will be unpredicatable.
 */
