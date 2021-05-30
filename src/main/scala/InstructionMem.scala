//import chisel3._
//
//class InstructionMem extends Module {
//  val io = IO(new Bundle {
//    val PC: UInt = Input(UInt(32.W))
//    val req_i: UInt = Input(UInt(1.W))
//    val fetch_ready_i: UInt = Input(UInt(1.W))
//
//    //val inst: UInt = Output(UInt(32.W))
//    val fetch_valid_o: UInt = Output(UInt(1.W))
//    val fetch_rdata_o: UInt = Output(UInt(32.W))
//    val fetch_addr_o: UInt = Output(UInt(32.W))
//    val prefetch_busy_o: UInt = Output(UInt(1.W))
//
//  })
//  //reg
//  val mem: Vec[UInt] = Reg(Vec(128, Bits(8.W)))
//
//  io.fetch_addr_o := io.PC
//
//  io.fetch_rdata_o(31, 24) := mem(io.PC)
//  io.fetch_rdata_o(23, 16) := mem(io.PC + 1.U)
//  io.fetch_rdata_o(15, 8) := mem(io.PC + 2.U)
//  io.fetch_rdata_o(7, 0) := mem(io.PC + 3.U)
//
//  when((io.req_i & io.fetch_ready_i) === true.B) {
//    io.fetch_valid_o := 1.U(1.W)
//    io.prefetch_busy_o := 0.U(1.W)
//  }.otherwise {
//    io.fetch_valid_o := 0.U(1.W)
//    io.prefetch_busy_o := 1.U(1.W)
//  }
//}
//
