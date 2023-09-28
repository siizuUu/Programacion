import os
import readchar
from random import randint

POS_X = 0
POS_Y = 1
NUM_OF_MAP_OBJECTS = 10
RED = '\033[91m'
GREEN = '\033[92m'
RESET = '\033[0m'

obstacle_definition = """\
###       ##########
###       ##########
###       ##########
              ######
              ######
##                  
######              
######              
###                 
##        #         
         ###        
          #         
                   #
######           ###
########        ####\
"""

my_position = [6, 3]
tail_length = 0
tail = []
map_objects = []

# create_obstacle_map
obstacle_definition = [list(row) for row in obstacle_definition.split("\n")]

MAP_WIDTH = len(obstacle_definition[0])
MAP_HEIGHT = len(obstacle_definition)
while True:

    os.system("cls")

    # draw map
    print("+" + "-" * MAP_WIDTH * 3 + "+")
    for coordinate_y in range(MAP_HEIGHT):
        print("|", end="")
        for coordinate_x in range(MAP_WIDTH):

            char_to_draw = " "
            object_in_cell = None
            for map_object in map_objects:
                if map_object[POS_X] == coordinate_x and map_object[POS_Y] == coordinate_y:
                    char_to_draw = "*"
                    object_in_cell = map_object

            for tail_piece in tail:
                if tail_piece[POS_X] == coordinate_x and tail_piece[POS_Y] == coordinate_y:
                    char_to_draw = (GREEN + "█" + RESET)

            if my_position[POS_X] == coordinate_x and my_position[POS_Y] == coordinate_y:
                char_to_draw = (GREEN + "█" + RESET)

                if object_in_cell:
                    map_objects.remove(object_in_cell)
                    tail_length += 1

                if my_position in tail:
                    os.system("cls")
                    print(RED + "Snake ha muerto" + RESET)
                    exit()
            if obstacle_definition[coordinate_y][coordinate_x] == "#":
                char_to_draw = "#"
            print(" {} ".format(char_to_draw), end="")
        print("|")
    print("+" + "-" * MAP_WIDTH * 3 + "+")