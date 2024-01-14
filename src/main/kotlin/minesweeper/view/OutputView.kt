package minesweeper.view

import minesweeper.domain.board.GameBoard
import minesweeper.domain.board.Tile

object OutputView {
    private const val MINE_SYMBOL = "*"

    fun printMineBoard(board: GameBoard) {
        for (tiles in board.board) {
            printTiles(tiles)
            println()
        }
    }

    private fun printTiles(tiles: List<Tile>) {
        for (tile in tiles) {
            val symbol = if (tile.isMineActive()) MINE_SYMBOL else tile.getNeighborMineCount()
            print("$symbol ")
        }
    }
}
