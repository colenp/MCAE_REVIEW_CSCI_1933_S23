#sum list using recursion 
def sum_list(lst):
    if lst == []:
        return 0 
    else:
        return lst[0] + sum_list(lst[1:])
# sum list using iterative 
def sum_list(lst):
    total = 0 
    for i in lst:
        total += i
    return total 
        
