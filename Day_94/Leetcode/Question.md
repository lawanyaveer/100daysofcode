# Question Topic - Course Schedule II

## Link - https://leetcode.com/problems/course-schedule-ii/description/?envType=study-plan-v2&envId=top-interview-150


## Description

There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. 

You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. 

If it is impossible to finish all courses, return an empty array.

## Constraints:

1 <= numCourses <= 2000

0 <= prerequisites.length <= numCourses * (numCourses - 1)

prerequisites[i].length == 2

0 <= ai, bi < numCourses

ai != bi

All the pairs [ai, bi] are distinct.
