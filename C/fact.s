	.file	"meli.cpp"
	.local	_ZStL8__ioinit
	.comm	_ZStL8__ioinit,1,1
	.globl	det
	.bss
	.align 4
	.type	det, @object
	.size	det, 16
det:
	.zero	16
	.text
	.globl	_Z4facti
	.type	_Z4facti, @function
_Z4facti:
.LFB969:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$40, %esp
	movl	$0, -12(%ebp)
	cmpl	$0, 8(%ebp)
	je	.L2
	movl	8(%ebp), %eax
	subl	$1, %eax
	movl	%eax, (%esp)
	call	_Z4facti
	imull	8(%ebp), %eax
	jmp	.L3
.L2:
	movl	$1, %eax
.L3:
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE969:
	.size	_Z4facti, .-_Z4facti
	.globl	main
	.type	main, @function
main:
.LFB970:
	.cfi_startproc
	.cfi_personality 0,__gxx_personality_v0
	.cfi_lsda 0,.LLSDA970
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	andl	$-16, %esp
	subl	$32, %esp
	jmp	.L6
.L9:
	movl	28(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$_ZSt4cout, (%esp)
.LEHB0:
	call	_ZNSolsEi
	movl	$_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, 4(%esp)
	movl	%eax, (%esp)
	call	_ZNSolsEPFRSoS_E
.L6:
	leal	28(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$_ZSt3cin, (%esp)
	call	_ZNSirsERi
	movl	(%eax), %edx
	subl	$12, %edx
	movl	(%edx), %edx
	addl	%edx, %eax
	movl	%eax, (%esp)
	call	_ZNKSt9basic_iosIcSt11char_traitsIcEEcvPvEv
.LEHE0:
	testl	%eax, %eax
	je	.L7
	movl	28(%esp), %eax
	cmpl	$42, %eax
	je	.L7
	movl	$1, %eax
	jmp	.L8
.L7:
	movl	$0, %eax
.L8:
	testb	%al, %al
	jne	.L9
	movl	$0, %eax
	jmp	.L13
.L12:
	movl	%eax, (%esp)
.LEHB1:
	call	_Unwind_Resume
.LEHE1:
.L13:
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE970:
	.globl	__gxx_personality_v0
	.section	.gcc_except_table,"a",@progbits
.LLSDA970:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE970-.LLSDACSB970
.LLSDACSB970:
	.uleb128 .LEHB0-.LFB970
	.uleb128 .LEHE0-.LEHB0
	.uleb128 .L12-.LFB970
	.uleb128 0
	.uleb128 .LEHB1-.LFB970
	.uleb128 .LEHE1-.LEHB1
	.uleb128 0
	.uleb128 0
.LLSDACSE970:
	.text
	.size	main, .-main
	.type	_Z41__static_initialization_and_destruction_0ii, @function
_Z41__static_initialization_and_destruction_0ii:
.LFB979:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$24, %esp
	cmpl	$1, 8(%ebp)
	jne	.L14
	cmpl	$65535, 12(%ebp)
	jne	.L14
	movl	$_ZStL8__ioinit, (%esp)
	call	_ZNSt8ios_base4InitC1Ev
	movl	$__dso_handle, 8(%esp)
	movl	$_ZStL8__ioinit, 4(%esp)
	movl	$_ZNSt8ios_base4InitD1Ev, (%esp)
	call	__cxa_atexit
.L14:
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE979:
	.size	_Z41__static_initialization_and_destruction_0ii, .-_Z41__static_initialization_and_destruction_0ii
	.type	_GLOBAL__sub_I_det, @function
_GLOBAL__sub_I_det:
.LFB980:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$24, %esp
	movl	$65535, 4(%esp)
	movl	$1, (%esp)
	call	_Z41__static_initialization_and_destruction_0ii
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE980:
	.size	_GLOBAL__sub_I_det, .-_GLOBAL__sub_I_det
	.section	.init_array,"aw"
	.align 4
	.long	_GLOBAL__sub_I_det
	.hidden	__dso_handle
	.ident	"GCC: (Ubuntu/Linaro 4.7.2-2ubuntu1) 4.7.2"
	.section	.note.GNU-stack,"",@progbits
