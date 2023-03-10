/*
 *  language.js
 *  在浏览器控制台输出信息
 *  Author       : SeeChen Lee
 *  Version      : 1.0.0
 *  Last Modified: 12-Jan-2023 16:50
 */

export function consoleMessage() {

    console.log("%c小蓝鸟项目","font-size: 24px; color: #0081C9;");
    console.log("....   ....   ....   ....\n" +
        "....   ....   ....   ....\n" +
        "....   .... . ....   ....\n" +
        "....   .... # ...... ....\n" +
        "   .... ###    #  ...#   \n" +
        "   ...#         # ... ,  \n" +
        "    .#           #...    \n" +
        "....              #  ....\n" +
        "....W         #   # .E#..\n" +
        "....t     K        W ....\n" +
        "....           ##;;;#....\n" +
        "   W       #  ##;;;;#    \n" +
        " . #      ###.## ;;;#    \n" +
        " .     ;;;  #;#   ; ..   \n" +
        ".....  ;;;;        # ....\n" +
        "....#  ;;;   #    #  .W..\n" +
        "....#   ;  # ## #.   ....\n" +
        ".... #      ##  #.   ....\n" +
        "    ... ####   i# ... j  \n" +
        "    ... #       # ...    \n" +
        "  .:... #       # ...    \n" +
        "....   .#  L   D..   ....\n" +
        "....   ...#.##....   ....\n" +
        "....   ....#  #...   ....\n" +
        "....   ....   ....   ....")
    console.log("\n" +
        "    __  ___               __                       \n" +
        "   /  |/  /__  ____ ___  / /_  ___  __________   _ \n" +
        "  / /|_/ / _ \\/ __ `__ \\/ __ \\/ _ \\/ ___/ ___/  (_)\n" +
        " / /  / /  __/ / / / / / /_/ /  __/ /  (__  )  _   \n" +
        "/_/  /_/\\___/_/ /_/ /_/_.___/\\___/_/  /____/  (_)  \n" +
        "                                                   \n" +
        "%c\tLeYe\tLau\n\tSeeChen\tLee\n\tViHang\tTan\n\tWinYi\tLee", "font-size: 1.5em; color: #0ff");
    console.log('%O', new Date());
}